import React from "react";

import { books } from "./Books";
import { blogs } from "./Blogs";
import { courses } from "./Courses";

function Blogger() {

  // Course Details

  const coursedet = (

    <div>

      {courses.map((course) =>

        <div key={course.id}>

          <h2>{course.cname}</h2>

          <h4>{course.date}</h4>

        </div>

      )}

    </div>

  );

  // Book Details

  const bookdet = (

    <div>

      {books.map((book) =>

        <div key={book.id}>

          <h3>{book.bname}</h3>

          <h4>{book.price}</h4>

        </div>

      )}

    </div>

  );

  // Blog Details

  const content = (

    <div>

      {blogs.map((blog) =>

        <div key={blog.id}>

          <h2>{blog.title}</h2>

          <h4>{blog.author}</h4>

          <p>{blog.content}</p>

        </div>

      )}

    </div>

  );

  return (

    <div className="container">

      <div className="box">

        <h1>Course Details</h1>

        {coursedet}

      </div>

      <div className="box">

        <h1>Book Details</h1>

        {bookdet}

      </div>

      <div className="box">

        <h1>Blog Details</h1>

        {content}

      </div>

    </div>

  );

}

export default Blogger;
