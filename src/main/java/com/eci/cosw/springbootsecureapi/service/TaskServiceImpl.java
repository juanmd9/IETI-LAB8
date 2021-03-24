package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private List<Task> tasks = new ArrayList<>();

    @Autowired
    public TaskServiceImpl() { }

    @PostConstruct
    private void populateSampleData()
    {
        tasks.add( Task.builder().id(1l).description("Tarea de ieti").status("Ready").responsible("Juan").dueDate(new Date()).build() );
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public Task getTask( Long id ) {
        Task taskFind = null;
        for (Task task : tasks) {
            if(task.getId()==id){
                taskFind = task;
            }
        }
        return taskFind;
    }

    @Override
    public List<Task> createTask( Task task ) {
        tasks.add(task);
        return tasks;
    }

}
