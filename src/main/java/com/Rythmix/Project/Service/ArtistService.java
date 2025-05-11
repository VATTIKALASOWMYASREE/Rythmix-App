package com.Rythmix.Project.Service;

import com.Rythmix.Project.model.Artist;
import com.Rythmix.Project.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Artist updateArtist(Long id, Artist updatedArtist) {
        return artistRepository.findById(id).map(artist -> {
            artist.setName(updatedArtist.getName());
            artist.setGenre(updatedArtist.getGenre());
            artist.setCountry(updatedArtist.getCountry());
            return artistRepository.save(artist);
        }).orElse(null);
    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}

