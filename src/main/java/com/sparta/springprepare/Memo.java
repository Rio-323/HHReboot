package com.sparta.springprepare;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
public class Memo {
    private final String username;
    private String contents;
}

class Main{
    public static void main(String[] args) {
        Memo memo = new Memo("Sparta");
        //memo.setUsername("Sparta");

        System.out.println (memo.getUsername());
    }
}