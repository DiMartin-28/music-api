package com.diaz.api.service;

import java.util.List;
import com.diaz.api.entity.Album;

public interface IAlbumsService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
