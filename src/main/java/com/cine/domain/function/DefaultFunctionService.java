package com.cine.domain.function;

import com.cine.database.repositories.DefaultFunctionRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DefaultFunctionService implements  FunctionService{

    private DefaultFunctionRepository defaultFunctionRepository;

    public DefaultFunctionService(DefaultFunctionRepository defaultFunctionRepository) {
        this.defaultFunctionRepository = defaultFunctionRepository;
    }

    @Override
    public List<Function> findFunctionByIdMovie(int id) {
        return defaultFunctionRepository.findFunctionByIdMovie(id);
    }

    @Override
    public Function save(Function function) {
        return defaultFunctionRepository.save(function);
    }

    @Override
    public Function findById(int id) {
        return defaultFunctionRepository.findById(id);
    }

    @Override
    public List<Function> findByDateAndIdTheater(Date date, int idTheater) {
        return defaultFunctionRepository.findByDateAndIdTheater(date,idTheater);
    }

    @Override
    public List<Function> getAll() {
        return defaultFunctionRepository.getAll();
    }
}
