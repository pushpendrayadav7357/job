# Project Assignment README

## Project Summary
This project aims to create a simple web application for a To-Do list. It allows users to add, view, update, and delete tasks in a web interface. The purpose is to demonstrate a basic understanding of web development using a specific framework and language.

## Frameworks and Language Used
- **Framework:** Flask
- **Programming Language:** Python

## Data Flow
Data flows as follows:

### Controller
- The controller handles incoming HTTP requests and routes them to the appropriate service functions.
- Functions include `add_task`, `view_tasks`, `update_task`, and `delete_task`.

### Services
- Services manage the business logic of the application.
- They communicate with the repository to retrieve or update task data.
- Functions include:
    - `add_task`: Adds a new task to the list.
    - `view_tasks`: Retrieves and displays tasks.
    - `update_task`: Updates task information.
    - `delete_task`: Deletes a task.

### Repository
- The repository is responsible for the interaction with the database.
- It includes functions for CRUD operations on tasks.
- Functions include:
    - `fetch_task`: Retrieves a task from the database.
    - `update_task`: Updates task data.
    - `delete_task`: Deletes a task.

### Database Design
- The database is designed using SQLite and includes a single table: `tasks`.
- Table structure:
    - `task_id` (Primary Key)
    - `task_name` (Text)
    - `task_description` (Text)
    - `task_status` (Integer, 0 for incomplete, 1 for complete)

## Data Structure Used in  Project
- Lists and dictionaries are used to manage data temporarily within the application.
