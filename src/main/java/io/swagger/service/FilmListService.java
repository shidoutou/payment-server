package io.swagger.service;

import io.swagger.domain.Film;
import io.swagger.domain.FilmList;
import io.swagger.mapper.FilmListMapper;
import io.swagger.mapper.FilmMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class FilmListService {

    @Autowired
    private FilmListMapper filmListMapper;

    @Autowired
    private FilmMapper filmMapper;

    public Page<FilmList> findByPage(Integer pageNo, Integer pageSize, String sortBy) {
        PageHelper.startPage(pageNo, pageSize, sortBy); //line 1
        return filmListMapper.findByPage(); //line 2
    }

    public Film findById(Integer filmId) {
        return filmMapper.selectByPrimaryKey(filmId);
    }
}
