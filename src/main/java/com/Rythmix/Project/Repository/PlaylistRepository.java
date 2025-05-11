package com.Rythmix.Project.Repository;
import java.util.List;

import com.Rythmix.Project.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    // Custom query example
    List<Playlist> findByUserId(Long userId);
}
