package com.Rythmix.Project.controller;

import com.Rythmix.Project.model.ListenHistory;
import com.Rythmix.Project.Service.ListenHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/listenhistory")
public class ListenHistoryController {

    @Autowired
    private ListenHistoryService listenHistoryService;

    @GetMapping
    public List<ListenHistory> getAllHistories() {
        return listenHistoryService.getAllHistories();
    }

    @GetMapping("/{id}")
    public Optional<ListenHistory> getHistoryById(@PathVariable Long id) {
        return listenHistoryService.getHistoryById(id);
    }

    @PostMapping
    public ListenHistory createHistory(@RequestBody ListenHistory history) {
        return listenHistoryService.createHistory(history);
    }

    @PutMapping("/{id}")
    public ListenHistory updateHistory(@PathVariable Long id, @RequestBody ListenHistory history) {
        return listenHistoryService.updateHistory(id, history);
    }

    @DeleteMapping("/{id}")
    public void deleteHistory(@PathVariable Long id) {
        listenHistoryService.deleteHistory(id);
    }
}
