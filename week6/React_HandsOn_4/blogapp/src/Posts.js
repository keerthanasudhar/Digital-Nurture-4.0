import React, { Component } from 'react';
import Post from './Post'; // Ensure this is correct

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postsArray = data.map(p => new Post(p.userId, p.id, p.title, p.body));
        this.setState({ posts: postsArray });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
      });
  };

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert('An error occurred: ' + error);
  }

  render() {
    return (
      <div>
        <h1>Posts List</h1>
        {this.state.posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
