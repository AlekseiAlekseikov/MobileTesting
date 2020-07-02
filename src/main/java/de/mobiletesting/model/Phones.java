package de.mobiletesting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Phones {
    @Id
    private final String id;
    private final String Phone_model;
    private final String A_type;
    private final String Operating_system;
    private final String Operating_system_version;
    private final String Screen_diagonal;
    private final String Screen_resolution;
    private final String SIM_Card;
    private final String Main_camera;
    private final String Front_camera;
    private final String CPU;
    private final String CPU_clock_speed;
    private final String Number_of_Cores;
    private final String CPU_microarchitecture;
    private final String CPU_capacity;
    private final String Graphics_Accelerator;
    private final String GPU_frequency;
    private final String RAM;
    private final String Persistent_memory;
    private final String Memory_card_support;
    private final String Weight;


    public Phones(String id, String Phone_model, String A_type, String Operating_system, String Operating_system_version, String Screen_diagonal, String Screen_resolution, String SIM_Card, String Main_camera, String Front_camera, String CPU, String CPU_clock_speed, String Number_of_Cores, String CPU_microarchitecture, String CPU_capacity, String Graphics_Accelerator, String GPU_frequency, String RAM, String Persistent_memory, String Memory_card_support, String Weight) {
        this.id = id;
        this.Phone_model = Phone_model;
        this.A_type = A_type;
        this.Operating_system = Operating_system;
        this.Operating_system_version = Operating_system_version;
        this.Screen_diagonal = Screen_diagonal;
        this.Screen_resolution = Screen_resolution;
        this.SIM_Card = SIM_Card;
        this.Main_camera = Main_camera;
        this.Front_camera = Front_camera;
        this.CPU = CPU;
        this.CPU_clock_speed = CPU_clock_speed;
        this.Number_of_Cores = Number_of_Cores;
        this.CPU_microarchitecture = CPU_microarchitecture;
        this.CPU_capacity = CPU_capacity;
        this.Graphics_Accelerator = Graphics_Accelerator;
        this.GPU_frequency = GPU_frequency;
        this.RAM = RAM;
        this.Persistent_memory = Persistent_memory;
        this.Memory_card_support = Memory_card_support;
        this.Weight = Weight;
    }

    public String getid() {return id;}
    public String getPhone_model() {return Phone_model;}
    public String getA_type() {return A_type;}
    public String getOperating_system() {return Operating_system;}
    public String getOperating_system_version() {return Operating_system_version;}
    public String getScreen_diagonal() {return Screen_diagonal;}
    public String getScreen_resolution() {return Screen_resolution;}
    public String getSIM_Card() {return SIM_Card;}
    public String getMain_camera() {return Main_camera;}
    public String getFront_camera() {return Front_camera;}
    public String getCPU() {return CPU;}
    public String getCPU_clock_speed() {return CPU_clock_speed;}
    public String getNumber_of_Cores() {return Number_of_Cores;}
    public String getCPU_microarchitecture() {return CPU_microarchitecture;}
    public String getCPU_capacity() {return CPU_capacity;}
    public String getGraphics_Accelerator() {return Graphics_Accelerator;}
    public String getGPU_frequency() {return GPU_frequency;}
    public String getRAM() {return RAM;}
    public String getPersistent_memory() {return Persistent_memory;}
    public String getMemory_card_support() {return Memory_card_support;}
    public String getWeight() {return Weight;}
}
