package pojo;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

public class User implements Serializable {

	private Integer id;
	private String name;
	private String password;
	private String nickname;
	private Date birth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	private static RowMapper<User> rowMapper = new RowMapper<User>() {
		public User mapRow(ResultSet resultSet, int index) throws SQLException {
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setName(resultSet.getString("name"));
			user.setPassword(resultSet.getString("password"));
			user.setNickname(resultSet.getString("nickname"));
			user.setBirth(resultSet.getDate("birth"));
			return user;
		}
	};

	public static RowMapper<User> getRowMapper() {
		return rowMapper;
	}
	
}
