package com.sxn.potionce.data;

public enum ConflictGroup {

    DEFAULT ("Default"),
    FORCE("Force"),
    POA ("Potion_Offensive_Attack"),
    PDA ("Potion_Defensive_Attack"),
    POD ("Potion_Offensive_Defense"),
    PD ("Potion_Defensive"),
    ;

    private final String group;

    private ConflictGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }
}