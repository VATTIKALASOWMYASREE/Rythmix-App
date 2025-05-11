package com.Rythmix.Project.Service;
import java.util.*;
import com.Rythmix.Project.model.ListenHistory;
import com.Rythmix.Project.Repository.ListenHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListenHistoryService {

    @Autowired
    private ListenHistoryRepository listenHistoryRepository;

    // Get all listen histories
    public List<ListenHistory> getAllHistories() {
        return listenHistoryRepository.findAll();
    }

    // Get history by ID
    public Optional<ListenHistory> getHistoryById(Long id) {
        return listenHistoryRepository.findById(id);
    }

    // Create new listen history
    public ListenHistory createHistory(ListenHistory history) {
        if (history == null || history.getTrackName() == null || history.getUser() == null || history.getListenedAt() == null) {
            throw new IllegalArgumentException("Invalid listen history data.");
        }
        return listenHistoryRepository.save(history);
    }

    // Update listen history by ID
    public ListenHistory updateHistory(Long id, ListenHistory updatedHistory) {
        return listenHistoryRepository.findById(id).map(history -> {
            // Check if updatedHistory is valid
            if (updatedHistory == null || updatedHistory.getTrackName() == null || updatedHistory.getUser() == null || updatedHistory.getListenedAt() == null) {
                throw new IllegalArgumentException("Invalid updated history data.");
            }
            // Update the fields of the existing history
            history.setTrackName(updatedHistory.getTrackName());
            history.setListenedAt(updatedHistory.getListenedAt());
            history.setUser(updatedHistory.getUser());

            return listenHistoryRepository.save(history);
        }).orElseThrow(() -> new RuntimeException("History not found with id " + id));
    }

    // Delete listen history by ID
    public void deleteHistory(Long id) {
        if (listenHistoryRepository.existsById(id)) {
            listenHistoryRepository.deleteById(id);
        } else {
            throw new RuntimeException("History not found with id " + id);
        }
    }
}
