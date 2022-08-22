package com.diaz.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diaz.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
