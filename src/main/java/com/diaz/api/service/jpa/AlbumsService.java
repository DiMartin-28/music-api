package com.diaz.api.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diaz.api.entity.Album;
import com.diaz.api.repository.AlbumsRepository;
import com.diaz.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	@Override
	public void guardar(Album album) {
		// TODO Auto-generated method stub
		repoAlbums.save(album);
	}

	@Override
	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
	}
}
