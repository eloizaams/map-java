package entites;

import java.util.Objects;

public class Votation {
	
	private String candidate;
	private int votes;

	public Votation(String candidate, int votes) {
		this.candidate = candidate;
		this.votes = votes;
	}

	public final String getCandidate() {
		return candidate;
	}

	public final void setCandidate(String candidate) {
		this.candidate = candidate;
	}

	public final int getVotes() {
		return votes;
	}

	public final void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(candidate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Votation other = (Votation) obj;
		return Objects.equals(candidate, other.candidate);
	}
	
	
	

}
