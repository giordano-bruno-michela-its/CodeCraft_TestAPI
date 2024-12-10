package com.codecraft.test_rest_api.controller;

import com.codecraft.test_rest_api.model.FasciaEta;
import com.codecraft.test_rest_api.model.FormPrenotazione;
import com.codecraft.test_rest_api.model.FormRichiesta;
import com.codecraft.test_rest_api.model.TipoAttivita;
import com.codecraft.test_rest_api.repository.FasciaEtaRepository;
import com.codecraft.test_rest_api.repository.FormRichiestaRepository;
import com.codecraft.test_rest_api.repository.TipoAttivitaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/formreq")
public class FormRichiestaController {

    private final FormRichiestaRepository formRichiestaRepository;
    private final FasciaEtaRepository fasciaEtaRepository;
    private final TipoAttivitaRepository tipoAttivitaRepository;

    public FormRichiestaController(FormRichiestaRepository formRichiestaRepository,
                                   FasciaEtaRepository fasciaEtaRepository,
                                   TipoAttivitaRepository tipoAttivitaRepository) {
        this.formRichiestaRepository = formRichiestaRepository;
        this.fasciaEtaRepository = fasciaEtaRepository;
        this.tipoAttivitaRepository = tipoAttivitaRepository;
    }

    @GetMapping("/all")
    public List<FormRichiesta> getAllFormRichiesta() {
        return formRichiestaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<FormRichiesta> getFormRichiestaById(@PathVariable Long id) {
        return formRichiestaRepository.findById(id);
    }

    @PostMapping("/createreq")
    public FormRichiesta createFormRichiesta(@RequestBody FormRichiesta formRichiesta) {
        return formRichiestaRepository.save(formRichiesta);
    }

    @PostMapping("/createprenot")
    public FormPrenotazione createFormPrenotazione(@RequestBody FormPrenotazione formPrenotazione) {
        FasciaEta fasciaEta = fasciaEtaRepository.findById(formPrenotazione.getFasciaEta().getId())
                .orElseThrow(() -> new RuntimeException("FasciaEta not found"));
        TipoAttivita tipoAttivita = tipoAttivitaRepository.findById(formPrenotazione.getTipoAttivita().getId())
                .orElseThrow(() -> new RuntimeException("TipoAttivita not found"));

        formPrenotazione.setFasciaEta(fasciaEta);
        formPrenotazione.setTipoAttivita(tipoAttivita);

        return formRichiestaRepository.save(formPrenotazione);
    }

    @PutMapping("/update/{id}")
    public FormRichiesta updateFormRichiesta(@PathVariable Long id, @RequestBody FormRichiesta formRichiestaDetails) {
        FormRichiesta formRichiesta = formRichiestaRepository.findById(id).orElseThrow();
        BeanUtils.copyProperties(formRichiestaDetails, formRichiesta, getNullPropertyNames(formRichiestaDetails));
        return formRichiestaRepository.save(formRichiesta);
    }

    private String[] getNullPropertyNames(FormRichiesta source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFormRichiesta(@PathVariable Long id) {
        formRichiestaRepository.deleteById(id);
    }
}
