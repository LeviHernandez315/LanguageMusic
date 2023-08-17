package unah.lenguajes.proyecto.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.JoinColumn;

@Entity
@Table(name="playlistcancion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistCancion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylistCancion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idplaylist", referencedColumnName = "idplaylist")
    private Playlist playlist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcancion", referencedColumnName = "idcancion")
    private Cancion cancion;

    
	public PlaylistCancion(int idPlaylistCancion, Playlist playlist, Cancion cancion) {
		super();
		this.idPlaylistCancion = idPlaylistCancion;
		this.playlist = playlist;
		this.cancion = cancion;
	}

	public int getIdPlaylistCancion() {
		return idPlaylistCancion;
	}

	public void setIdPlaylistCancion(int idPlaylistCancion) {
		this.idPlaylistCancion = idPlaylistCancion;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

    // Constructor, getters y setters
    
    
}
