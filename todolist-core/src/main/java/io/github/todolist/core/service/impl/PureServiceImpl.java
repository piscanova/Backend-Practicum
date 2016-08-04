package io.github.todolist.core.service.impl;

import io.github.todolist.core.domain.Pure;
import io.github.todolist.core.repository.api.PureRepository;
import io.github.todolist.core.service.api.PureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by thanksgiving on 8/2/16.
 */
@Service
@Transactional
public class PureServiceImpl implements PureService {
    @Autowired
    private PureRepository pureRepository;

    public List<Pure> getPureByInfection(final String infection, final int page) {
         return pureRepository.getPureByInfection(infection, page);
    }

    public List<Pure> getPureByIp(final String ip, final int page) {
         return pureRepository.getPureByIp(ip, page);
    }

    public List<Pure> getPureByFileName(final String fileName, final int page) {
         return pureRepository.getPureByFileName(fileName, page);
    }
}
