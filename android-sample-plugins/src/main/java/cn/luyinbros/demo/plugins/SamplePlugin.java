package cn.luyinbros.demo.plugins;

import com.android.build.gradle.AppPlugin;
import com.android.build.gradle.LibraryPlugin;

import org.gradle.api.Action;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.internal.impldep.org.jetbrains.annotations.NotNull;

public class SamplePlugin implements Plugin<Project> {
    @Override
    public void apply(@NotNull Project project) {
        project.getPlugins().all(new Action<Plugin>() {
            @Override
            public void execute(@NotNull Plugin plugin) {
                if (plugin instanceof LibraryPlugin) {
                    System.out.println("execute library");
                }else if (plugin instanceof AppPlugin){
                    System.out.println("execute app");
                }

            }
        });
    }
}
