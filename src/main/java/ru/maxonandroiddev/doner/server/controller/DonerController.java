package ru.maxonandroiddev.doner.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.maxonandroiddev.doner.server.entity.DonerDot;
import ru.maxonandroiddev.doner.server.repository.DonerRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/doner")
public class DonerController {

    @Autowired
    private DonerRepository donerRepository;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public DonerDot getReminder() {
        List<DonerDot> list = donerRepository.findAll();
        return createMockRemid();
    }

    private DonerDot createMockRemid() {
        DonerDot donerDot = new DonerDot();
        donerDot.setId(1);
        donerDot.setDate(new Date());
        donerDot.setTitle("My first donerDot");
        donerDot.setInfo("goooooooooooooooooood");
        donerDot.setLat(3453453.3453);
        donerDot.setLng(342344.6564);
        String [] comments = {"fsfefwe","ssrwerwefwef","sdfsfwefwe"};
        donerDot.setComments(comments);
        return donerDot;
    }

}
