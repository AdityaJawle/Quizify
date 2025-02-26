# Quizify - Quiz Application Backend

**Quizify** is a backend system for a Quiz Application, developed using **Spring Boot** and **H2 Database**. This project provides a set of RESTful APIs to manage quizzes and questions, including CRUD operations and dynamic quiz generation.

## Tech Stack

- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database** (for development and testing)
- **Postman** (for API testing)
- **Maven**

## Features

- **CRUD Operations** for questions and quizzes.
- **Randomized Quiz Generation** based on category and question count.
- **RESTful APIs** for interacting with quiz data.
- **Modular and Scalable Architecture** for easy future enhancements.

## API Endpoints

### Question APIs

#### 1. Get All Questions
- **Endpoint:** `GET /question/allQuestions`
- **Description:** Fetch all available questions.
- **Response (Example):**

 ![Screenshot (120)](https://github.com/user-attachments/assets/d31185d5-2626-4cf7-ab71-dd144e1ff36d)


#### 2. Get Questions by Category
- **Endpoint:** `GET /question/category/{category}`
- **Description:** Fetch all questions from a specific category.
- **Example:** GET /question/category/Java

  ![Screenshot (121)](https://github.com/user-attachments/assets/4c501d55-7950-4508-97d6-1bc9cc80380b)


 
#### 3. Add a Question
- **Endpoint:** `POST /question/add`
- **Description:** Add a new question.
- **Response (Example):**

 ![Screenshot (122)](https://github.com/user-attachments/assets/a6af00bc-951b-4c64-b30e-2ce7d7879dec)



### Quiz APIs
#### 4. Create a Quiz
- **Endpoint:** `POST /quiz/create?category={category}&numQ={numQ}&title={title}`
- **Description:** Creates a quiz by randomly selecting {numQ} questions from the specified category.
- **Example:** POST /quiz/create?category=Java&numQ=5&title=JQuiz
- **Response (Example):**


  ![Screenshot (123)](https://github.com/user-attachments/assets/55eee8b0-9ffa-4001-8bfb-e572b1ae195e)


#### 5. Fetch a Quiz
- **Endpoint:** `GET /quiz/get/{id}`
- **Description:** Fetch a quiz by its ID.
- **Example:** GET /quiz/get/1

 ![Screenshot (124)](https://github.com/user-attachments/assets/8b9e215e-7626-43ec-a18a-ff249a8d74bf)



#### 6. Submit a Quiz
- **Endpoint:** `POST /quiz/submit/{id}`
- **Description:** Submit answers for a quiz and get the result.
- **Example:** POST /quiz/submit/1

  ![Screenshot (125)](https://github.com/user-attachments/assets/7b1e1f2f-df9b-4d77-8b9d-6c7b13368182)



## Installation
- **Clone the repository:**

- `git clone https://github.com/AdityaJawle/quizify.git`


- **Navigate to the project directory:**

- `cd quizify`

- **Install dependencies:**

- `mvn clean install`

- **Run the application:**

- `mvn spring-boot:run`

- **The application will run on http://localhost:8080.**

## Testing the APIs

### Use Postman to test the APIs:

- `GET /question/allQuestions` - Fetch all questions.
- `GET /question/category/{category}` - Get questions by category.
- `POST /question/add` - Add a new question.
- `POST /quiz/create?category={category}&numQ={numQ}&title={title}` - Create a quiz.
- `GET /quiz/get/{id}` - Fetch a quiz.
- `POST /quiz/submit/{id}` - Submit a quiz.

## Future Enhancements

- User authentication and role-based access control.

- Score tracking and leaderboards.

- Enhanced quiz submission validation.
