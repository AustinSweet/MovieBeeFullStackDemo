package app.models.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 6797325658129389279L;

	private static final int MAX_CHARS = 1000;

    private static final int MIN_CHARS = 1;

    @NotNull
    @Size(min = MIN_CHARS, max = MAX_CHARS)
    private String title;
    
    @ManyToMany
    private Set<User> users;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
    
    
}
