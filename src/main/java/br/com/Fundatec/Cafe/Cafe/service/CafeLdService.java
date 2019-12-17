package br.com.Fundatec.Cafe.Cafe.service;

import br.com.Fundatec.Cafe.Cafe.Model.CafeModel;
import br.com.Fundatec.Cafe.Cafe.Repository.CafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeLdService {

    private final CafeRepository cafeRepository;

    public CafeLdService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }
    public List<CafeModel> ListaProdutos(String nome){
        return cafeRepository.findByNomeContainingIgnoreCase(nome);

    }
}
