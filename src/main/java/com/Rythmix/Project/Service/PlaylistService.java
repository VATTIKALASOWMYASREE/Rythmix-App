package com.Rythmix.Project.Service;

import com.Rythmix.Project.model.Playlist;
import com.Rythmix.Project.Repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public Optional<Playlist> getPlaylistById(Long id) {
        return playlistRepository.findById(id);
    }

    public Playlist createPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public Playlist updatePlaylist(Long id, Playlist updatedPlaylist) {
        return playlistRepository.findById(id).map(playlist -> {
            playlist.setName(updatedPlaylist.getName());
            playlist.setUser(updatedPlaylist.getUser());
            return playlistRepository.save(playlist);
        }).orElse(null);
    }

    public void deletePlaylist(Long id) {
        playlistRepository.deleteById(id);
    }
}

