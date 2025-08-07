import React, { useState } from "react";
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";

function App() {
  const [view, setView] = useState("all");

  return (
    <div style={{ textAlign: "center" }}>
      <h1>Blogger App</h1>
      <button onClick={() => setView("course")}>Course Details</button>
      <button onClick={() => setView("book")}>Book Details</button>
      <button onClick={() => setView("blog")}>Blog Details</button>
      <button onClick={() => setView("all")}>Show All</button>

      <div style={{ display: "flex", justifyContent: "center", marginTop: 30 }}>
        {(view === "course" || view === "all") && <CourseDetails />}
        {(view === "book" || view === "all") && <BookDetails />}
        {(view === "blog" || view === "all") && <BlogDetails />}
      </div>
    </div>
  );
}

export default App;
