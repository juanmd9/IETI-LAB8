package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;

import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public interface TaskService
{
    List<Task> getTasks();

    Task getTask( Long id );

    List<Task> createTask( Task Task );
}