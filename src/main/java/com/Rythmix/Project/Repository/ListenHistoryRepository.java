package com.Rythmix.Project.Repository;
import java.util.List;

import com.Rythmix.Project.model.ListenHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListenHistoryRepository extends JpaRepository<ListenHistory, Long> {
    List<ListenHistory> findByUserId(Long userId);
}
