package com.Rythmix.Project.Repository;


import com.Rythmix.Project.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    // Optional: custom query example
    Artist findByName(String name);
}