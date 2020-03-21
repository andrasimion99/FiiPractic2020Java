package fii.practic.yonder.demo.controller;

import fii.practic.yonder.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    @RequestMapping(value = "/test")
    //http://localhost:8081/doctors?pageNumber=0&pageSize=10
    public String getTestMessage() {
//        if (name != null) {
//            return name;
//        } else {
//            return "nothing";
//        }
       // return "id-ul este: " + id + ". Numele este: " + name;
        return testService.getTestMessage();
    }

    @GetMapping
    public String getNames(){
        return testService.getAll();
    }

    @PostMapping
    public void save(@RequestBody String name){
        testService.save(name);
    }

    @PutMapping(value = "/{id}")
    public void udpate(@PathVariable Integer id, @RequestBody String newName){
        testService.update(id, newName);
    }

    @DeleteMapping(value = "delete/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
    }
}
