package org.zmoog.alchemy.resources;

/**
 * @author zmoog
 *
 */
public class Meta {

	private Integer limit;
	
	private Integer offset;
	
	private String next;
	
	private String previous;
	
	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getPrevious() {
		return previous;
	}

	public void setPrevious(String previous) {
		this.previous = previous;
	}

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer totalCount) {
		this.total_count = totalCount;
	}

	private Integer total_count;

	@Override
	public String toString() {
		return "Meta [limit=" + limit + ", offset=" + offset + ", next=" + next
				+ ", previous=" + previous + ", total_count=" + total_count
				+ "]";
	}
}
