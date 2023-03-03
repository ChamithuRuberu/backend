import React, { Component } from 'react'
import { Link } from 'react-router-dom'

export default class AddUser extends Component {
  render() {
    return (
      <div>
        <div className="content-wrapper">
        <h1>User</h1>
        <form>
        <div class="card-body">
        <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
        </input>
        </div>
        <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </input>
        </div>
        <div class="form-group">
        <label for="exampleInputFile">File input</label>
        <div class="input-group">
        <div class="custom-file">
        <input type="file" class="custom-file-input" id="exampleInputFile">
        </input>
        <label class="custom-file-label" for="exampleInputFile">Choose file</label>
        </div>
        <div class="input-group-append">
        <span class="input-group-text">Upload</span>
        </div>
        </div>
        </div>
        <div class="form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        </input>
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
        </div>
        </div>

        <div class="row">
        <div class="col-md-2">
            <button type="submit" class="btn btn-success btn-block btn-lg"><i class="fas fa-database"></i> Submit</button>
        </div>
        <div class="col-md-2">
            <Link to="/user" class="btn btn-secondary btn-block btn-lg">
                <i class="fas fa-stream"></i> Back to list
            </Link>
        </div>
        </div>
        </form>
        </div>
      </div>
    )
  }
}
