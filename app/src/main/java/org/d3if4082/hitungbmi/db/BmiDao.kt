package org.d3if4082.hitungbmi.db

interface BmiDao {
    @Dao
    interface BmiDao {
        @Insert
        fun insert(bmi: BmiEntity)
        @Query("SELECT * FROM bmi ORDER BY id DESC LIMIT 1")
        fun getLastBmi(): LiveData<BmiEntity?>
    }
}