package hw1;

// TODO: complete the methods
/**
 * Immutable Data Class for video objects.
 * Comprises a triple: title, year, director.
 *
 * @objecttype Immutable Data Class
 * @objectinvariant
 *   Title is non-null, no leading or final spaces, not empty string.
 * @objectinvariant
 *   Year is greater than 1800, less than 5000.
 * @objectinvariant
 *   Director is non-null, no leading or final spaces, not empty string.
 */
final class VideoObj implements Comparable<VideoObj> {
  /** @invariant non-null, no leading or final spaces, not empty string */
  private final String _title;
  /** @invariant greater than 1800, less than 5000 */
  private final int    _year;
  /** @invariant non-null, no leading or final spaces, not empty string */
  private final String _director;

  /**
   * Initialize all object attributes.
   * Title and director are "trimmed" to remove leading and final space.
   * @throws IllegalArgumentException if any object invariant is violated.
   */
  VideoObj(String title, int year, String director) {
    if (title == null)
    	throw new IllegalArgumentException("Title must be non-null.");
    if (!(title.trim().equals(title)))
    	throw new IllegalArgumentException("Title must not have leading or final spaces.");
    if (title == "")
    	throw new IllegalArgumentException("Title must not be an empty string.");
    if ((year <= 1800) || (year >= 5000))
    	throw new IllegalArgumentException("Year must be greater than 1800, less than 5000.");
    if (director == null)
    	throw new IllegalArgumentException("Director must be non-null.");
    if (!(director.trim().equals(director)))
    	throw new IllegalArgumentException("Director must not have leading or final spaces.");
    if (director == "")
    	throw new IllegalArgumentException("Director must not be an empty string.");
    _title = title;
    _year = year;
    _director = director;
  }

  /**
   * Return the value of the attribute.
   */
  public String director() {
    return _director;
  }

  /**
   * Return the value of the attribute.
   */
  public String title() {
    return _title;
  }

  /**
   * Return the value of the attribute.
   */
  public int year() {
    return _year;
  }

  /**
   * Compare the attributes of this object with those of thatObject.
   * @param thatObject the Object to be compared.
   * @return deep equality test between this and thatObject.
   */
  public boolean equals(Object thatObject) {
	if (thatObject == null) return false;
    if (this == thatObject) return true;
    if (!(this.getClass().equals(thatObject.getClass()))) return false;
    VideoObj that = (VideoObj) thatObject;
    return _director.equals(that._director)
    	&& _title.equals(that._title)
    	&& _year == that._year;
  }

  /**
   * Return a hash code value for this object using the algorithm from Bloch:
   * fields are added in the following order: title, year, director.
   */
  private int hcode;
  public int hashCode() {
    if (hcode == 0) {
    	hcode = 31;
    	hcode = 31*hcode + _title.length();
    	hcode = 31*hcode + _year;
    	hcode = 31*hcode + _director.length();
    }
    return hcode;
  }

  /**
   * Compares the attributes of this object with those of thatObject, in
   * the following order: title, year, director.
   * @param that the VideoObj to be compared.
   * @return a negative integer, zero, or a positive integer as this
   *  object is less than, equal to, or greater than that object.
   */
  public int compareTo(VideoObj that) {
	int titleCompare = this._title.compareTo(that._title);
	if (titleCompare != 0) return titleCompare;
	if (this._year < that._year) return -1;
	if (this._year > that._year) return 1;
	int directorCompare = this._director.compareTo(that._director);
	return directorCompare;
  }

  /**
   * Return a string representation of the object in the following format:
   * <code>"title (year) : director"</code>.
   */
  public String toString() {
    return _title + " (" + String.valueOf(_year) + ") : " + _director;
  }
}
