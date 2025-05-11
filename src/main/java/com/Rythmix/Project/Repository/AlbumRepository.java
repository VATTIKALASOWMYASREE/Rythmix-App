package com.Rythmix.Project.Repository;

import com.Rythmix.Project.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    // Optional: custom query example
    Album findByTitle(String title);
}
