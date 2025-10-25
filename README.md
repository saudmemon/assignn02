# MyApplication1 - Android Authentication App

A simple Android authentication application built with Java that demonstrates user login, signup, password reset, and basic navigation flows.

## Features

- **User Login**: Secure login functionality with username and password validation
- **User Registration**: New user signup interface
- **Forgot Password**: Password recovery flow
- **Password Reset**: Reset password functionality
- **Main Dashboard**: Protected main activity accessible after successful login
- **Logout**: Secure logout functionality

## Screenshots

_Add screenshots of your app here_

## Project Structure

```
com.example.myapplication1/
├── LoginActivity.java          # Main login screen
├── SignupActivity.java         # User registration screen
├── ForgetPasswordActivity.java # Forgot password screen
├── ResetPasswordActivity.java  # Password reset screen
└── MainActivity.java           # Main dashboard (post-login)
```

## Prerequisites

- Android Studio (Arctic Fox or later)
- Android SDK (minimum SDK 21)
- Java Development Kit (JDK) 8 or higher

## Installation

1. Clone the repository:
```bash
git clone https://github.com/saudmemon/myapplication1.git
```

2. Open the project in Android Studio

3. Sync Gradle files

4. Run the app on an emulator or physical device

## Usage

### Login Credentials (Demo)
- **Username**: `saud`
- **Password**: `321`

### Navigation Flow

1. **Login Screen** → Enter credentials to access the main dashboard
2. **Forgot Password** → Navigate to password recovery
3. **Signup** → Create a new account
4. **Main Activity** → Access after successful login
5. **Logout** → Return to login screen

## Key Components

### LoginActivity
- Validates user credentials
- Hardcoded demo credentials for testing
- Navigation to Signup and Forgot Password screens

### ForgetPasswordActivity
- Initiates password recovery process
- Links to ResetPasswordActivity

### ResetPasswordActivity
- Handles password reset functionality
- Returns to login screen after completion

### SignupActivity
- New user registration interface
- Links back to login screen

### MainActivity
- Protected main screen
- Logout functionality

## Built With

- **Java** - Primary programming language
- **Android SDK** - Android development framework
- **AndroidX** - Jetpack libraries
- **EdgeToEdge** - Modern Android UI implementation

## Future Enhancements

- [ ] Database integration (SQLite/Room)
- [ ] Actual authentication backend
- [ ] Input validation and error handling
- [ ] Password encryption
- [ ] Email verification
- [ ] Remember me functionality
- [ ] Biometric authentication
- [ ] Material Design 3 UI components

## Security Note

⚠️ **This is a demonstration app**. The current implementation uses hardcoded credentials for testing purposes. For production use:
- Implement proper authentication backend
- Use secure password hashing (bcrypt, Argon2)
- Add input validation and sanitization
- Implement secure session management
- Use HTTPS for all network communications

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

Your Name Saud Ahmed  - saudmemon581@gmail.com

Project Link: [https://github.com/saudmemon/myapplication1](https://github.com/saudmemon/myapplication1)

## Acknowledgments

- Android documentation
- Stack Overflow community
- Material Design guidelines
