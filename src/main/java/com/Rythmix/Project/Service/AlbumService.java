package com.Rythmix.Project.Service;

import com.Rythmix.Project.model.Album;
import com.Rythmix.Project.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Optional<Album> getAlbumById(Long id) {
        return albumRepository.findById(id);
    }

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Album updateAlbum(Long id, Album updatedAlbum) {
        return albumRepository.findById(id).map(album -> {
            album.setTitle(updatedAlbum.getTitle());
            album.setGenre(updatedAlbum.getGenre());
            album.setReleaseYear(updatedAlbum.getReleaseYear());
            album.setArtists(updatedAlbum.getArtists());
            return albumRepository.save(album);
        }).orElse(null);
    }

    public void deleteAlbum(Long id) {
        albumRepository.deleteById(id);
    }
}

