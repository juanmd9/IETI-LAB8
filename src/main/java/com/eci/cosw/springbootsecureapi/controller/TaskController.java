package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping( "api/task" )
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<?> getTasks(@RequestHeader Map<String, String> headers) throws ServletException {
        return ResponseEntity.ok(taskService.getTasks());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getTaskById(@PathVariable Long id, @RequestHeader Map<String, String> headers) throws ServletException {
        return ResponseEntity.ok(taskService.getTask(id));
    }

    @PostMapping
    public ResponseEntity<?> createTask(@RequestBody Task task, @RequestHeader Map<String, String> headers ) throws ServletException {
        return ResponseEntity.ok(taskService.createTask(task));
    }

}
