package com.springmvc.listener;

/**
 * @Description:
 * @Author: liuyuxiang
 * @Date: Created in 14:57 2018/11/7
 */
class Even {
    private Person person;

    public Even(Person person) {
        super();
        this.person = person;
    }

    public Even() {
        super();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
