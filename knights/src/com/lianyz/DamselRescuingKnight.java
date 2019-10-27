package com.lianyz;

class DamselRescuingKnight {

    private RescueDamselQuest quest;
    private Minstrel minstrel;

    DamselRescuingKnight(Minstrel minstrel) {
        this.quest = new RescueDamselQuest();
        this.minstrel = minstrel;
    }

    void embarkOnQuest() {
        minstrel.singBeforeQuest();
        quest.embark();
        minstrel.singAfterQuest();
    }
}
