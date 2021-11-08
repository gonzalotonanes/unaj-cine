package com.cine.domain.function;

import java.util.Date;
import java.util.List;

public interface FunctionService {

    List<Function> findFunctionByIdMovie(int id);
    Function save(Function function);
    Function findById(int id);
    List<Function> findByDateAndIdTheater(Date date, int idTheater);
    List<Function> getAll();
}
