package com.hl.pojo;

import com.hl.pojo.Cat;
import com.hl.pojo.Dog;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
//    @Autowired
    @Resource
//    @Qualifier("cat2")
    private Cat cat;
//    @Autowired
//    @Qualifier("dog2")
    @Resource
    private Dog dog;
    private String name;
}
