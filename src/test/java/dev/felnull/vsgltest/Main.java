package dev.felnull.vsgltest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.felnull.vsgl.VoxelShapeGenerator;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static final Gson GSON = new Gson();


    public static void main(String[] args) throws Exception {
        VoxelShapeGenerator vsg = new VoxelShapeGenerator(new FileInputStream("samples/sample.json"));
        long time = System.currentTimeMillis();
        JsonObject jo = vsg.generateV2();
        System.out.println((System.currentTimeMillis() - time) + "ms");
        Files.write(Paths.get("gen.json"), GSON.toJson(jo).getBytes(StandardCharsets.UTF_8));
    }
}
