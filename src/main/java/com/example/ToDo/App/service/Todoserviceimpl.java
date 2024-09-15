//package com.example.ToDo.App.service;
//
//import com.example.ToDo.App.model.ToDo;
//import com.example.ToDo.App.repositry.IToDoRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class Todoserviceimpl implements Todoservice {
//
//    @Autowired
//    private IToDoRepo iToDoRepo;
//
//    @Override
//    public List<ToDo> getAllTODO() {
//        return iToDoRepo.findAll();
//    }
//
//    @Override
//    public ToDo getToDoItemById(Long id) {
//        Optional<ToDo> optionalToDo = iToDoRepo.findById(id);
//        return optionalToDo.orElse(null); // Return null if not found
//    }
//
//    @Override
//    public boolean saveOrUpdateToDoItem(ToDo toDo) {
//        try {
//            iToDoRepo.save(toDo);
//            return true;
//        } catch (Exception e) {
//            // Optionally log the exception here
//            return false;
//        }
//    }
//
//    @Override
//    public boolean updateStatus(Long id) {
//        Optional<ToDo> optionalToDo = iToDoRepo.findById(id);
//        if (optionalToDo.isPresent()) {
//            ToDo toDo = optionalToDo.get();
//            toDo.setStatus("complete");
//            return saveOrUpdateToDoItem(toDo);
//        }
//        return false; // Return false if the ToDo item was not found
//    }
//
//    @Override
//    public boolean deleteTODOItem(Long id) {
//        if (iToDoRepo.existsById(id)) {
//            iToDoRepo.deleteById(id);
//            return true;
//        }
//        return false; // Return false if the ToDo item was not found
//    }
//}
