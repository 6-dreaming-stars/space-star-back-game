package com.spacestar.back.gamegenre.service;

import com.spacestar.back.gamegenre.dto.res.GameGenreResDto;

import java.util.List;

public interface GameGenreService {
    List<GameGenreResDto> getGameGenres();
}