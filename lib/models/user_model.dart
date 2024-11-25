class User {
  final String username;
  final String email;
  final String password;

  User({required this.username, required this.email, required this.password});

  Map<String, String> toJson() {
    return {
      'username': username,
      'email': email,
      'password': password,
    };
  }
}
