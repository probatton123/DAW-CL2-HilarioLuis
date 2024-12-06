package pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.service;

import pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.dto.FilmDetailDto;
import pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.dto.FilmDto;
import pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.dto.FilmRegisterDto;
import pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.dto.FilmUpdateDto;
import pe.edu.i202222714.DAWI_HILARIO_TRINIDAD_LUIS.entity.Language;

import java.util.List;

public interface MaintenanceService {
    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();
}
