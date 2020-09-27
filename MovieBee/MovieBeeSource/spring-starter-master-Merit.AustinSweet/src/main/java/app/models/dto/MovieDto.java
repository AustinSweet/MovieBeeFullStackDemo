package app.models.dto;

import javax.validation.constraints.NotNull;

import app.models.entity.Movie;

public class MovieDto {
    @NotNull
    private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
    public Movie toEntity() {
        final Movie movie = new Movie();
        movie.setTitle(this.getTitle());
        return movie;
    }
    
}
