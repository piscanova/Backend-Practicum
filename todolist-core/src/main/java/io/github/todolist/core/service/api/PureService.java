package io.github.todolist.core.service.api;

import io.github.todolist.core.domain.Pure;

import java.util.List;

/**
 * Created by thanksgiving on 8/2/16.
 */
public interface PureService {
    List<Pure> getPureByInfection(final String infection, final int page);

    List<Pure> getPureByIp(final String ip, final int page);

    List<Pure> getPureByFileName(final String fileName, final int page);
    //    Pure getPureByCountry(final String country);
//    Pure getPureByState(final String state);
}
