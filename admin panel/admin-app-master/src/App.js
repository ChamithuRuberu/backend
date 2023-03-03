import logo from './logo.svg';
import './App.css';
import Header from './Header';
import Menu from './Menu';
import Dashboard from './Dashboard';
import Footer from './Footer';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import AddUser from './AddUser';
import AddMovies from './AddMovies';
import Booking from './Booking';
import UserList from './UserList';
import MovieList from './MovieList';
import BookingList from './BookingList';

function App() {
  return (
    <div class="wrapper">
      < BrowserRouter>
      <Header/>
      <Menu/>
      <Routes>
      <Route path='/'
        element={<Dashboard />}>
      </Route>
      <Route path='/add'
        element={<Dashboard />}>
      </Route>
      <Route path='/user'
        element={<UserList />}>
      </Route>
      <Route path='/movies'
        element={<MovieList />}>
      </Route>
      <Route path='/booking'
        element={<BookingList />}>
      </Route>
      <Route path='/userForm'
        element={<AddUser />}>
      </Route>
      <Route path='/movieForm'
        element={<AddMovies />}>
      </Route>
      <Route path='/bookingForm'
        element={<Booking />}>
      </Route>
      </Routes>
      <Footer/>
      
      
      </BrowserRouter>
    </div>
  );
}

export default App;
