package com.oleksii.android_app_004_portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectsViewHolder> {

    Project[] projects;

    ProjectsAdapter(Project[] projects){
        this.projects = projects;
    }

    @NonNull
    @Override

    public ProjectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);

        return new ProjectsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectsViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    static class ProjectsViewHolder extends RecyclerView.ViewHolder {

        private final ImageView appImage;
        private final TextView title;
        private final TextView description;
        public ProjectsViewHolder(@NonNull View itemView) {
            super(itemView);
            appImage = itemView.findViewById(R.id.image_view_app_logo);
            title = itemView.findViewById(R.id.text_view_app_name);
            description = itemView.findViewById(R.id.text_view_app_description);
        }

        public void bind(Project project) {
            title.setText(project.name);
            description.setText(project.description);
            appImage.setImageResource(project.resource_image);
        }
    }
}
