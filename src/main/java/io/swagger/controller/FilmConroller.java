package io.swagger.controller;

import io.swagger.domain.Film;
import io.swagger.domain.FilmList;
import io.swagger.service.FilmListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class FilmConroller {

    @Autowired
    FilmListService filmListService;

    @GetMapping("/films")
    public ResponseEntity<List<FilmList>> getAllFilms(
        @RequestParam(defaultValue = "1") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize,
        @RequestParam(defaultValue = "fid") String sortBy
    ) {
        List<FilmList> list = filmListService.findByPage(pageNo, pageSize, sortBy);
        return new ResponseEntity<>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/film/{filmId}")
    public Film findById(@PathVariable Integer filmId) {
        return filmListService.findById(filmId);
    }
}
